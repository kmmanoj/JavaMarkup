# JavaMarkup
A template engine, that allows web developers to develop html pages conveniently<br/>
<small>For *nix Systems</small>
<hr/>

JavaMarkup, is a html template engine similar to <b> npm's jade</b>, but uses non-indentation specific coding;
<ul type="none">
<li><b>Implementation</b> : Java Programming</li>
<li><b>File type</b> : .jm</li>
<li><b>Working</b> : file.jm --<code>JavaMarkup</code>--&gt file.html</li>
</ul>

<h3>Installation</h3>
<ul>
	<li>Run <code>./install</code> </li>
	<li>That's it! You may use <code>jmparse</code> command line tool</li>
</ul>

<h3>JavaMarkup</h3>
<ul type="square">
	<li>
		A html tag can be syntactically similar to a function call as in imperative language.<br/>
		For example, <br/>
		<code>img(src="path/to/file.jpg",alt="image");</code><br/>
		corresponds to<br/>
		<code>&lt;img src="path/to/file.jpg" alt="image"/&gt;</code><br/>
	</li>
	<li>
		A html tag with innerHTML is followed by flower braces enclosing raw text<br/>
		For example, <br/>
		<code>a(href="nextpage.html"){"Next"};</code><br/>
		corresponds to <br/>
		<code>&lt;a href="nextpage.html"&gt;Next&lt;/a&gt;</code><br/>
	</li>
	<li>
		The most common attributes class, and id can also be represented in a single line with the html tag
		<small> <i>We hinder from avoiding them as parameter, because array variable values or varibales can hold id and class names.</i></small> 
		For example, <br/>
		<code>p.class1#id.class2(){};</code> <br/>
		corresponds to<br/>
		<code>&lt;p id="id" class="class1 class2"&gt;&lt;/p&gt;</code><br/>
	</li>
	<li>
		The script tag innerHTML will have the usual javascript code and syntax. The javascript code is not parsed.<br/>
		Similarly, the style tag innerHTML will have the usual css syntax. <br/>
		For example,<br/>
		<code>
			script(type="text/javascript"){ <br/>
				window.alert("JavaMarkup\'s javascript"); <br/>
			};
		</code><br/>
		corresponds to<br/>
		<code> 
			&lt;script type="text/javascript"&gt;<br/>
				window.alert("JavaMarkup\'s javascript"); <br/>
			&lt;/script&gt;
		</code><br/>
		<code> 
			style(type="text/css"){ img{ width: 100px; height: 100px; float: right; } };
		</code><br/>
		corresponds to<br/>
		<code> 
			&lt;style type="text/css"&gt;<br/>
				img{ width: 100px; height: 100px; float: right; }<br/>
			&lt;style&gt;
		</code><br/>
	</li>
	<li>
		JavaMarkup supports single line comments.<br/>
		The comments follow the double forward slash '//'<br/>
	</li>
	<li>
		JavaMarkup supports variables which can hold strings. <br/>
		Strings can be concatenated by using '+' sign.<br/>
		They are differentiated from tags by prefixing them with '$' sign.<br/>
		variable without prefixing $ is used for <b>set</b> and prefixing it with $ is used for <b>get</b>
		For example, <br/>
		The variables are defined as :<br/>
		<code>
		variablename = "List item";<br/>
		ul(type="square"){<br/>
			li{ $variablename+" 1" };<br/>
			li{ $variablename+" 2" };<br/>
			li{ $variablename+" 3" };<br/>
		};<br/>
		</code><br/>
	</li>
	<li>
		JavaMarkup supports iterative rendering of html code, and supports arrays, to achieve DRY (Don't Repeat Yourself)<br/>
		<code>
		ul(type="none"){<br/>
		% i rep 10 %<br/>
			li{ "List item "+$i };
		% endrep %<br/>
		};<br/>
		</code><br/>
		JavaMarkup Arrays are defined as:
		<code> array = [ "abc", "def", "ghi" ]; </code><br/>
		And, are accessed as , for example the second element by : <br/>
		<code> $array[1] </code><br/>
		<small> <i>JavaMarkup arrays require further documentation </i></small><br/>
	</li>
</ul>
