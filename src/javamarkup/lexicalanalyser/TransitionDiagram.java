package javamarkup.lexicalanalyser;

import java.util.ArrayList;

class TransitionDiagram {
    private static TransitionDiagram td;
    private State root;
    private State keyword;
    private State keywordWithRetract;
    private State tag;
    private State tagWithRetract;
    private State attribute;
    private State attributeWithRetract;
    private State identifier;
    private State identifierWithRetract;
    private State id;

    private ArrayList<Character> letters;
    private ArrayList<Character> digits;
    private ArrayList<Character> delimiters;
    private ArrayList<Character> rest;

    public static TransitionDiagram getTransitionDiagram(){
        if(td == null){
            return new TransitionDiagram();
        } else {
            return td;
        }
    }

    private TransitionDiagram(){
        this.letters = new ArrayList<>();
        for(char i='A';i<='Z';i++)
            this.letters.add(i);
        for(char i='a';i<='z';i++)
            this.letters.add(i);
        this.digits = new ArrayList<>();
        for(char i='0';i<='9';i++)
            this.digits.add(i);
        this.delimiters = new ArrayList<>();
        this.delimiters.add(' ');
        this.delimiters.add('\n');
        this.delimiters.add('\r');
        this.delimiters.add('\t');
        this.delimiters.add('\0');
        this.rest = new ArrayList<>();
        for(int i=33;i<48;i++)
            this.rest.add((char)i);
        for(int i=58;i<65;i++)
            this.rest.add((char)i);
        for(int i=91;i<97;i++)
            this.rest.add((char)i);
        for(int i=123;i<127;i++)
            this.rest.add((char)i);

        this.root = new State();
        this.keyword = new State(Type.KEYWORD,false);
        this.keywordWithRetract = new State(Type.KEYWORD,true);
        this.tag = new State(Type.TAG,false);
        this.tagWithRetract= new State(Type.TAG,true);
        this.attribute = new State(Type.ATTRIBUTE,false);
        this.attributeWithRetract = new State(Type.ATTRIBUTE,true);
        State stringliteral = new State(Type.STRING,false);
        State symbol = new State(Type.SYMBOL,false);
        this.identifier = new State(Type.IDENTIFIER,false);
        this.identifierWithRetract= new State(Type.IDENTIFIER,true);
        this.id = new State();

        for(Character c : this.letters)
            id.nextStates.put(c,this.id);
        for(Character c : this.digits)
            id.nextStates.put(c,this.id);
        for(Character c : this.rest)
            id.nextStates.put(c,this.identifierWithRetract);
        this.id.nextStates.put('-',this.id);
        this.id.nextStates.put('_',this.id);
        for(Character c : this.delimiters)
            this.id.nextStates.put(c, this.identifier);

        State numeric = new State(Type.NUMBER, false);
        State numericWithRetract = new State(Type.NUMBER, true);
        State intermediateNum = new State();

        // handling numeric values : 7
        for(Character c : this.digits)
            this.root.nextStates.put(c, intermediateNum);
        for(Character c : this.digits)
            intermediateNum.nextStates.put(c, intermediateNum);
        for(Character c : this.letters)
            intermediateNum.nextStates.put(c, numericWithRetract);
        for(Character c : this.delimiters)
            intermediateNum.nextStates.put(c, numeric);
        for(Character c : this.rest)
            intermediateNum.nextStates.put(c, numericWithRetract);

        // handling delimiters : 0
        for(Character c : this.delimiters)
            this.root.nextStates.put(c, this.root);

        // handling symbols : 6
        Character[] symbols = {'.','#','$','+','{','}','(',')',',','/','[',']','%',';',':'};
        for(Character c :symbols)
            this.root.nextStates.put(c, symbol);

        // handling string literals : 5
        this.root.nextStates.put('\"',new State());
        State tmp = this.root.nextStates.get('\"');
        for(int i=0;i<128;i++)
            tmp.nextStates.put((char)i,tmp);
        tmp.nextStates.put('\"', stringliteral);

        // handling identifiers : 4
        for(Character c : letters)
            this.root.nextStates.put(c, this.id);

        // handling keywords : 1
        String[] keywords = {
                "endrep","rep","doctype","html"
        };
        for(String key : keywords)
            this.insert(key, Type.KEYWORD);

        // handling tags : 2
        String[] tags = {
            "a","abbr","acronym","address","applet","area","article","aside","audio",
                "b","base","basefont","bdi","bdo","big","blockquote","body","br","button",
                "canvas","caption","center","cite","code","col","colgroup",
                "datalist","dd","del","details","dfn","dialog","dir","div","dl","dt",
                "em","embed",
                "fieldset","figcaption","figure","font","footer","form","frame","frameset",
                "h1","h2","h3","h4","h5","h6","head","header","hr",
                "i","iframe","img","input","ins",
                "kbd","keygen",
                "label","legend","li","link",
                "main","map","mark","manu","menuitem","meta","meter",
                "nav","noframes","noscript",
                "object","ol","optgroup","option","output",
                "p","param","picture","pre","progress",
                "q",
                "rp","rt","ruby",
                "s","samp","script","section","select","small","source","span","strike","strong","style","sub","summary","sup",
                "table","tbody","td","tfoot","th","thead","time","title","tr","track","tt",
                "u","ul",
                "var","video",
                "wbr"
        };
        for(String tag : tags)
            this.insert(tag, Type.TAG);

        // handling attributes : 3
        String[] attributes = {
            "accept","accept-charset","accesskey","action","align","alt","async","autocomplete","autofocus","autoplay",
                "bgcolor","border",
                "challenge","charset","checked","icite","class","color","cols","colspan","content","contenteditable","contextmenu","controls","coords",
                "data","datetime","default","defer","idir","dirname","disabled","download","draggable","dropzone",
                "enctype",
                "for","iform","formaction",
                "headers","height","hidden","high","href","hreflang","http-equiv",
                "id","ismap",
                "keytype","kind",
                "ilabel","lang","list","loop","low",
                "manifest","max","maxlength","media","method","min","multiple","muted",
                "name","novalidate",
                "onabort","onafterprint","onbeforeprint","onbeforeunload","onblur","oncanplay","oncanplaythrough","onchange","onclick","oncontextmenu","oncopy","oncuechange","oncut","ondblclick","ondrag","ondragend","ondragenter","ondragleave","ondragover","ondragstart","ondurationchanged",
                "onemptied","onended","onerror","onfocus","onhashchange","oninput","oninvalid","onkeydown","onkeypress","onkeyup","onload","onloaddeddata","onloadedmetadata","onloadstart","onmousedown","onmousemove","onmouseout","onmouseover","onmouseup","onmousewheel","onoffline","ononline",
                "onpagehide","onpageshow","onpaste","onpuase","onplay","onplaying","onpopstate","onprogress","onratechange","onreset","onresize","onscroll","onsearch","onseeked","onseeking","onselect","onshow","onstalled","onstorage","onsubmit","onsuspend",
                "ontimeupdate","ontoggle","onunload","onvolumechange","onwaiting","onwheel","open","optimum",
                "pattern","placeholder","poster","preload",
                "readonly","rel","required","reversed","rows","rowspan",
                "sandbox","scope","scoped","selected","shape","size","sizes","span","spellcheck","src","srcdoc","srclang","srcset","start","step","istyle",
                "tabindex","target","title","translate","type",
                "usemap",
                "value",
                "width","wrap"
        };
        for(String attr : attributes)
            this.insert(attr, Type.ATTRIBUTE);
    }

    public State getRoot(){
        return this.root;
    }

    private State prepareState(State s){
        for(Character c : this.letters)
            s.nextStates.put(c, this.id);
        for(Character c : this.digits)
            s.nextStates.put(c, this.id);
        for(Character c : this.rest)
            s.nextStates.put(c, this.identifierWithRetract);
        for(Character c : this.delimiters)
            s.nextStates.put(c, this.identifier);
        s.nextStates.put('-',this.id);
        s.nextStates.put('_',this.id);
        return s;
    }

    private void insert(String string, Type type){
        State ptr = this.root;
        for(char c : string.toCharArray()) {
            // assuming all strings that are given as input for a certain type, are also identifiers
            if(ptr.nextStates.get(c) == this.id || ptr.nextStates.get(c) == this.identifierWithRetract ||
                ptr.nextStates.get(c) == this.keywordWithRetract || 
                ptr.nextStates.get(c) == this.tagWithRetract || 
                ptr.nextStates.get(c) == this.attributeWithRetract){
                ptr.nextStates.remove(c);
                ptr.nextStates.put(c,new State());
                ptr = ptr.nextStates.get(c);
                ptr = this.prepareState(ptr);
            } else {
                ptr = ptr.nextStates.get(c);
            }
        }

        if(type.getValue() == 1) {
            for(Character c : this.rest)
                ptr.nextStates.put(c, this.keywordWithRetract);
            for(Character c : this.delimiters)
                ptr.nextStates.put(c, this.keyword);
        }else if(type.getValue() == 2) {
            for(Character c : this.rest)
                ptr.nextStates.put(c, this.tagWithRetract);
            for(Character c : this.delimiters)
                ptr.nextStates.put(c, this.tag);
        } else if(type.getValue() == 3) {
            for(Character c : this.rest)
                ptr.nextStates.put(c, this.attributeWithRetract);
            for(Character c : this.delimiters)
                ptr.nextStates.put(c, this.attribute);
        } else {
            for(Character c : this.rest)
                ptr.nextStates.put(c,null);
            for(Character c : this.delimiters)
                ptr.nextStates.put(c, null);
        }
    }

    public State move(State ptr, Character c){
        if(ptr.nextStates.containsKey(c))
            return ptr.nextStates.get(c);
        else
            return null;
    }
}
