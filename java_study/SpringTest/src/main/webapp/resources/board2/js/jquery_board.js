$(function(){
	$('#reply').click(function(){
		document.parentForm.action='writeForm.sp';
		document.parentForm.submit();
	});

	$('#list1').click(function(){// content.jsp
		// javascript:location.href='list.do';
		
		document.parentForm.action='boardList.sp';
		document.parentForm.submit();
	});
	
	$('#list2').click(function(){ // writeForm.jsp
//		document.writeForm.action='list.do';
//		document.writeForm.submit();
		
				 javascript:location.href='boardList.sp';
		//		document.writeForm.submit();
	});
	
	$('#list3').click(function(){// content.jsp
		// javascript:location.href='list.do';
		
	document.updateForm.action='boardList.sp';
		document.updateForm.submit();
	});
} )