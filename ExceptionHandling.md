<h4>Handling exceptions as below</h4>
<ul>
  <li>try with catch block</li>
  <li>try with multi catch block</li>
  <li>Nested try block</li>
</ul>



<h4>1.What is throw keyword</h4>
Java throw keyword is used to throw an exception explicitly..Throw can be used inside the block. 

<h4>2.What is throws keyword</h4>

Throws can propagate back the error to calling function.This needs to add at the method level

<h4>3.How to intercept the exception?</h4>

<h4>4.Why we need to intercept the exception?</h4>
<h4>5.What is finally block in java</h4>
<ul>
<li>finally block will execute by default</li>
<li>Mostly in the finally block we used to close the connections and streams</li>
</ul>
<h4>Flow chart for finally Block</h4>
<img src="src\images\java-finally-block.png" alt="Trulli" width="500" height="333">

<h4>Cases to skip finally block?</h4>
By writing the system.exit method inside try/catch block can stop the execution of finally block

<h4>Possible cases of try ,catch and finally block

1.Can write Try with  with final </br>
2.Cannot write catch without try </br>

<h4>Exception Handling with Method Overriding in Java</h4>
<h4>If the superclass method does not declare an exception</h4>
<ul>
<li>If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception</li>
</ul>
