function pwCheck(s) {
	window.name = "parentForm";
	if (s == 'u') {
		document.parentForm.action = 'memberUpdate.mg';
	} else if (s == 'd') {
		document.parentForm.action = 'memberDelete.mg';
	}
	window.open("idCheck.mg", "idCheck",
			"width=500, height=200, location=no, menubar=no, resizable=no, scrollbar=no");
}

function setParentText() {
	opener.document.parentForm.cpass.value = document.getElementById("pwCheck").value;
	window.close();
	compare();
}

function compare() {
	var pw = opener.document.parentForm.mempass.value;
	var cpw = opener.document.parentForm.cpass.value;
	// alert(pw+":"+cpw)
	if (pw == cpw) {
		var f = opener.document.parentForm;

		f.submit();
		idCheck.window.close()
	} else {
		alert("비밀번호 오류");
		idCheck.window.close();
	}
}