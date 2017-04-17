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
		The most common attributes class, and id can also be represented in a single line with the html tag.
		The id-class attribute list always begins with an optional single id, and followed by zero or more classes
		<small> <i>We hinder from avoiding them as parameter, because array variable values or varibales can hold id and class names.</i></small> 
		For example, <br/>
		<code>p#id.class2(){};</code> <br/>
		corresponds to<br/>
		<code>&lt;p id="id" class="class1 class2"&gt;&lt;/p&gt;</code><br/>
	</li>
	<li>
		JavaMarkup supports single line comments.<br/>
		The comments follow the double forward slash '//'<br/>
	</li>
</ul>
