package javamarkup.lexicalanalyser;

enum Type {
    DELIMITER("delimiter", 0),
    KEYWORD("keyword",1),
    TAG("tag",2),
    ATTRIBUTE("attribute",3),
    IDENTIFIER("identifier",4),
    STRING("string",5),
    SYMBOL("symbol",6),
    NUMBER("number",7);

    private int representation;
    private String type;

    Type(String type, int value){
        this.type = type;
        this.representation = value;
    }
    public Type getType(){
        return this;
    }
    public int getValue(){
        return this.representation;
    }
    public String getTypeName(){
        return this.type;
    }
}
