package javamarkup.semanticanalyser;

import java.io.*;

public class DOM {
	public TagWrapper root;

	public void connect(TagWrapper nodeParent, TagWrapper nodeChild) {
		nodeParent.children.add(nodeChild);
	}

	public String getCode(TagWrapper tagWrapper){
		return this.printCode(tagWrapper, 0);
	}
	public String printCode(TagWrapper tagWrapper, int lvl){
		String output = "";
		String tagName = tagWrapper.tag.tagName;
		for(int i=0;i<lvl;i++) output +="\t";
		output += "<"+tagName+tagWrapper.getAttributes();
		if(tagWrapper.tag.getShortClose()) output += "/>\n";
		else {
			output +=">\n";
			if(tagWrapper.children.size() == 0 && tagWrapper.tag.getInnerHTML()!=null){
				for(int i=0;i<lvl;i++) output +="\t";
				output+="\t"+tagWrapper.tag.getInnerHTML()+"\n";
			} else {
				for(TagWrapper tw : tagWrapper.children)
					output += printCode(tw, lvl+1);
			}
			for(int i=0;i<lvl;i++) output +="\t";
			output += "</"+tagName+">\n";
		}
		return output;
	}
}