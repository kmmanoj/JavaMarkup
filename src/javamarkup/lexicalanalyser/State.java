package javamarkup.lexicalanalyser;

import java.util.HashMap;

class State {
    private Type type;
    private boolean token;
    private boolean retract;
    public HashMap<Character, State> nextStates;

    State(){
        this.type = null;
        this.token = false;
        this.retract = false;
        this.nextStates = new HashMap<>();
    }

    State(Type type, boolean retract){
        this.type = type;
        this.token = true;
        this.retract = retract;
        this.nextStates = null;
    }

    @Override
    public String toString(){
        return type+" is "+(token?"":"not")+" a token "+" and retract : "+retract;
    }

    public int getTypeValue(){
        if(this.type != null)
            return type.getValue();
        else
            return -1;
    }

    public String getTypeName(){
        if(this.type != null)
            return type.getTypeName();
        else
            return null;
    }

    public Type getType(){
        return type;
    }

    public boolean isToken(){
        return this.token;
    }

    public boolean shouldRetract(){
        return this.retract;
    }
}
