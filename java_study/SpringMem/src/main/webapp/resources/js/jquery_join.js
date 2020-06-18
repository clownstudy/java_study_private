$(function(){
	
//	$('#reply').click(function(){
//		document.joinForm.action='writeForm.sp';
//		document.joinForm.submit();
//	});
//	
//	$('#list1').click(function(){
//		//javascript:location.href = 'list.do';
//		document.joinForm.action='boardList.sp';
//		document.joinForm.submit();
//	});
//	 
//	$('#list2').click(function(){
//		javascript:location.href = 'boardList.sp';
//		//document.joinForm.submit();
//	});
//	
//	$('#list3').click(function(){
//		document.updateForm.action = 'boardList.sp';
//		document.updateForm.submit();
//	});
	
	var wformObj = $("form[name='joinForm']");
	
	 $('#submit1').click(function(){
			if(fn_valiChk()){
				return false;
			}
			 wformObj.attr("action", "joinPro.mg");
			 wformObj.attr("method", "post");
			 wformObj.submit();
		});
	 
	 $('#password').keyup(function(){
	     $('font[name=check]').text('');
	     if($('#password').val()!=$('#passChk').val()){
	         $('font[name=check]').text('');
	         $('font[name=check]').text("비밀번호 다름");
	        }else{
	         $('font[name=check]').text('');
	         $('font[name=check]').text("비밀번호 같음");
	        }
	    });
	    $('#passChk').keyup(function(){
	     if($('#password').val()!=$('#passChk').val()){
	      $('font[name=check]').text('');
	      $('font[name=check]').text("비밀번호 다름");
	     }else{
	      $('font[name=check]').text('');
	      $('font[name=check]').attr('color','blue');
	      $('font[name=check]').text("비밀번호 같음");
	     }
	    });
})

  function fn_valiChk(){
		var regForm = $("form[name='joinForm'] .chk").length;
		for(var i = 0; i<regForm; i++){
			if($(".chk").eq(i).val() == "" || $(".chk").eq(i).val() == null){
				alert($(".chk").eq(i).attr("title")+"은/는 필수입력입니다.");
				$(".chk").eq(i).focus();
				return true;
			}
		}
	}