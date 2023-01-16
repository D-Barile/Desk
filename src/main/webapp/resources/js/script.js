let show = document.querySelector("#show");
let pass = document.querySelector("#pass");

show.addEventListener("click", function(){
	if(pass.type === "password"){
		pass.type = "text";
	}else{
		pass.type = "password";
	}
})