/*
* Script de vérification de formulaire d'inscription
*/

// regExpMAIL
var regEmail = new RegExp(/^[a-z0-9._-]+@[a-z0-9._-]+\.[a-z]{2,6}$/);

// regExpPWD
var regPwd = new RegExp(/^[0-9A-Za-z]{8}/);

// verif 1 nom, 2 pnom, 3 mail, 4 mdp, 5 pseudo 6 date
var verif = [false, false, false, false, false, false];

// nom
window.addEventListener("load", CheckNom);
// prenom
window.addEventListener("load", CheckPrenom);
// email
window.addEventListener("load", CheckEmail);
// mot de passe 
window.addEventListener("load", CheckPwd);
// Pseudo
window.addEventListener("load", CheckUsrnm);
// date
window.addEventListener("load", CheckDate);

// nom
lastname.addEventListener("input", CheckNom);
// prenom
firstname.addEventListener("input", CheckPrenom);
// email
useremail.addEventListener("input", CheckEmail);
// mot de passe 
userpwd.addEventListener("input", CheckPwd);
// Pseudo
username.addEventListener("input", CheckUsrnm);

// Date de naissance 
var datetemp = document.getElementById("birthdate");
var res = datetemp.value.split("/",3); // on découpe le string en arraylist, séparation par "/"
var regDate = new RegExp(/^[0-9]{2}[/][0-9]{2}[/](19|20)\d\d/);
console.log(res);
var datnais = new Date();
datnais.setFullYear(res[2]);
datnais.setMonth(res[1]-1);
datnais.setDate(res[0]);
console.log(datnais/*.getDate()*/);
birthdate.addEventListener("input", CheckDate);

function CheckNom() {
	if (lastname.value != "") {
		// console.log(lastname.value); // debug
		document.getElementById("plastname").style.color = "lightgray";
		verif[0] = true;
	}
	else {
		document.getElementById("plastname").style.color = "darkred";
	}
}

function CheckPrenom() {
	if (firstname.value != "") {
		// console.log(firstname.value); // debug
		document.getElementById("pfirstname").style.color = "lightgray";
		verif[1] = true;
	}
	else {
		document.getElementById("pfirstname").style.color = "darkred";
	}
}

function CheckEmail() {
	if (regEmail.test(useremail.value)) {
		// console.log(useremail.value); // debug
		document.getElementById("puseremail").style.color = "lightgray";
		verif[2] = true;
	}
	else {
		document.getElementById("puseremail").style.color = "darkred";
	}
}

function CheckPwd() {
	if (regPwd.test(userpwd.value)) {
		// console.log(userpwd.value);
		document.getElementById("puserpwd").style.color = "lightgray";
		verif[3] = true;
	}
	else {
		document.getElementById("puserpwd").style.color = "darkred";
	}
}

function CheckUsrnm() {
	if (username.value.length >= 6) {
		// console.log(username.value);
		document.getElementById("pusername").style.color = "lightgray";
		verif[4] = true;
	}
	else {
		document.getElementById("pusername").style.color = "darkred";
	}
}

function CheckDate() {
	if (regDate.test(datetemp.value)) {
		// console.log("ok");
		document.getElementById("pbirthdate").style.color = "lightgray";
		verif[5] = true;
		if (parseInt(res[2]) == datnais.getFullYear() && parseInt(res[1])-1 == datnais.getMonth() && parseInt(res[0])== datnais.getDate()) {
			console.log("Date :"+birthdate.value)
		}
	}
	else {
		document.getElementById("pbirthdate").style.color = "darkred";
	}
}


function estVrai(element, index, array) {
	return element == true;
}

function CheckForm() {
	if (verif.every(estVrai)) {
		document.getElementById("envoi").disabled=false;
	}
	else {
		document.getElementById("envoi").disabled=true;
	}
}

window.setInterval(CheckForm, "1000");
