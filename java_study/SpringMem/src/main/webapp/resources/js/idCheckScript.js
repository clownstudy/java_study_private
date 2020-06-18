function idVerify(){
	if(document.joinForm.idText.value==""){
		alert("아이디를 입력해주세요")
		document.joinForm.idText.focus();
		return false;
	} else {
		document.joinForm.submit();
	}
}