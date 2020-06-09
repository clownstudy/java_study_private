$(function(){
	$('#reply').click(function(){
		document.parentForm.action='writeForm.do';
		document.parentForm.submit();
	});

	$('#list1').click(function(){// content.jsp
		// javascript:location.href='list.do';
		
		document.parentForm.action='list.do';
		document.parentForm.submit();
	});
	
	$('#list2').click(function(){ // writeForm.jsp
//		document.writeForm.action='list.do';
//		document.writeForm.submit();
		
				 javascript:location.href='list.do';
		//		document.writeForm.submit();
	});
	
	$('#list3').click(function(){// content.jsp
		// javascript:location.href='list.do';
		
		document.updateForm.action='list.do';
		document.updateForm.submit();
	});
})