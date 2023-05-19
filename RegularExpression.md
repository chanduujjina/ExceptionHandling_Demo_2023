# Regular Expression
<h4>Number Regex : ^-?\\d+(\\.\\d+)?$</h4>

<ul>
<li> `^` indicates the start of the string.</li>
<li> `-?` allows an optional minus sign.</li>
<li> `\\d+` matches one or more digits.</li>
<li> `(\\.\\d+)?` matches an optional decimal part that starts with a dot and is followed by one or more digits..</li>
<li> `$` indicates the end of the string.</li>
</ul>

<h4>Alpha Regex : [a-zA-Z]+ </h4>

<h4>AlphaNumric Regex : [a-zA-Z0-9]+ </h4>

<h4>Regex for Password validation : ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$</h4>
<ul>
<li>^ represents starting character of the string.</li>
<li>(?=.*[0-9]) represents a digit must occur at least once.</li>
<li>(?=.*[a-z]) represents a lower case alphabet must occur at least once.</li>
<li>(?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
<li>(?=.*[@#$%^&-+=()] represents a special character that must occur at least once.</li>
<li>(?=\\S+$) white spaces don’t allowed in the entire string.</li>
<li>{8, 20} represents at least 8 characters and at most 20 characters.</li>
<li>$ represents the end of the string.</li>
</ul>

<h4>Following are the Constrains needs to satify while creating the password</h4>
<ul>
<li>It contains at least 8 characters and at most 20 characters.</li>
<li>It contains at least one digit.</li>
<li>It contains at least one upper case alphabet.</li>
<li>It contains at least one lower case alphabet.</li>
<li>It contains at least one special character which includes !@#$%&*()-+=^.</li>
<li>It doesn’t contain any white space.</li>
</ul>



 
  