function verify(){
	var namenumber=document.myform.txtname.value;
	if(namenumber==""){
		document.getElementById("titleNull").style.display = "";
	}
	if(parseInt(document.myform.number.value)<17){
	    document.getElementById("number1").style.display ="";
	}
	if(document.myform.password.value.length<8){
		document.getElementById("password1").style.display ="";//display:none表示隐藏内容。
	}
	if(document.myform.pass.value!=document.myform.password.value){
		document.getElementById("pass1").style.display ="";
	}
	if(document.myform.email.value.indexOf('@')==-1){
		document.getElementById("email1").style.display ="";
	}
}