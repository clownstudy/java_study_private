$(function(){
  $('#reply').click(function(){
	  document.parentForm.action='writeForm.sp';
	  document.parentForm.submit();	  
  });
  
  $('#list1').click(function(){
	  document.parentForm.action='boardList.sp';
	  document.parentForm.submit();	
	  });
  
  $('#list2').click(function(){
	  javascript:location.href='boardList.sp';
	  });
  
  $('#list3').click(function(){
	  document.updateForm.action='boardList.sp';
	  document.updateForm.submit();	
	  });
  
	var wirteformObj = $("form[name='joinForm']");
   $('#submit1').click(function(){
		if(fn_valiChk()){
			return false;
		}
	   wirteformObj.submit();
	});

  
    $('#passwd').keyup(function(){
     $('font[name=check]').text('');
     if($('#passwd').val()!=$('#passwd2').val()){
         $('font[name=check]').text('');
         $('font[name=check]').text("비밀번호 다름");
        }else{
         $('font[name=check]').text('');
         $('font[name=check]').text("비밀번호 같음");
        }
    });
    $('#passwd2').keyup(function(){
     if($('#passwd').val()!=$('#passwd2').val()){
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
				alert($(".chk").eq(i).attr("title")+"은(/는) 필수입력입니다.");
				$(".chk").eq(i).focus();
				return true;
			}
		}
	}

  
  