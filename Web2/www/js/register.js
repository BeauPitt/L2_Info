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
var res = datetemp.value.split("/",3);
var regDate = new RegExp(/^[0-9]{2}[/][0-9]{2}[/][0-9]{4}/);
console.log(res);
var datnais = new Date();
datnais.setFullYear(res[2]);
datnais.setMonth(res[1]-1);
datnais.setDate(res[0]);
console.log(datnais/*.getDate()*/);
birthdate.addEventListener("input", CheckDate);

function CheckNom() {
	if (lastname.value != "") {
		console.log(lastname.value); // debug
		verif[0] = true;
	}
}

function CheckPrenom() {
	if (firstname.value != "") {
		console.log(firstname.value); // debug
		verif[1] = true;
	}
}

function CheckEmail() {
	if (regEmail.test(useremail.value)) {
		console.log(useremail.value); // debug
		verif[2] = true;
	}
}

function CheckPwd() {
	if (regPwd.test(userpwd.value)) {
		console.log(userpwd.value);
		verif[3] = true;
	}
}

function CheckUsrnm() {
	if (username.value.length >= 6) {
		console.log(username.value);
		verif[4] = true;
	}
}

function CheckDate() {
	if (regDate.test(datetemp.value)) {
		console.log("ok");
		if (parseInt(res[2]) == datnais.getFullYear() && parseInt(res[1])-1 == datnais.getMonth() && parseInt(res[0])== datnais.getDate()) {
			console.log("Date ?"+birthdate.value)
			verif[5] = true;
		}
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

function Test() {
	// body...
	alert("Test");
}

// CheckForm();