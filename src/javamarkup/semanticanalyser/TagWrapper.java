package javamarkup.semanticanalyser;

import java.io.*;
import java.util.*;

public class TagWrapper {
	public Tag tag;
	public ArrayList<TagWrapper> children;

	public TagWrapper(Tag tag){
		this.tag = tag;
		children = new ArrayList<>();
	}

	public String getAttributes(){
		String output = " ";
		String attrs[] = {"accept", "acceptCharset", "action", "align", "alt", "async", "autocomplete", "autofocus", "autoplay", "bgcolor", "border", "challenge", "charset", "checked", "cite", "color", "cols", "colspan", "content", "controls", "coords", "datetime", "default", "defer", "dirname", "disabled", "download", "enctype", "for", "form", "formaction", "headers", "height", "high", "href", "hreflang", "httpEquiv", "ismap", "keytype", "kind", "label", "list", "loop", "low", "manifest", "max", "maxlength", "media", "method", "min", "multiple", "muted", "name", "novalidate", "open", "optimum", "pattern", "placeholder", "poster", "preload", "readonly", "rel", "required", "reversed", "rows", "rowspan", "sandbox", "scope", "scoped", "selected", "shape", "size", "sizes", "span", "src", "srcdoc", "srclang", "srcset", "start", "step", "target", "type", "usemap", "value", "width", "wrap", "accesskey", "contenteditable", "contextmenu", "dir", "data", "draggable", "dropzone", "hidden", "lang", "spellcheck", "style", "tabindex", "title", "translate", "onabort", "onafterprint", "onbeforeprint", "onbeforeunload", "onblur", "oncanplay", "oncanplaythrough", "onchange", "onclick", "oncontextmenu", "oncopy", "oncuechange", "oncut", "ondblclick", "ondrag", "ondragend", "ondragenter", "ondragleave", "ondragover", "ondragstart", "ondurationchanged", "onemptied", "onended", "onerror", "onfocus", "onhashchange", "oninput", "oninvalid", "onkeydown", "onkeypress", "onkeyup", "onload", "onloaddeddata", "onloadedmetadata", "onloadstart", "onmousedown", "onmousemove", "onmouseout", "onmouseover", "onmouseup", "onmousewheel", "onoffline", "ononline", "onpagehide", "onpageshow", "onpaste", "onpuase", "onplay", "onplaying", "onpopstate", "onprogress", "onratechange", "onreset", "onresize", "onscroll", "onsearch", "onseeked", "onseeking", "onselect", "onshow", "onstalled", "onstorage", "onsubmit", "onsuspend", "ontimeupdate", "ontoggle", "onunload", "onvolumechange", "onwaiting", "onwheel", "class", "id"};
		for(String attr : attrs)
			if(Mapper.getMethod(this.tag, attr) != null)
				output+=attr+"=\""+Mapper.getMethod(this.tag, attr)+"\" ";
		if(output.equals(" ")) return "";
		else return output.substring(0,output.length()-1);
	}

}