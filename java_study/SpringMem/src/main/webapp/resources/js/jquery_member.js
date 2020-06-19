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

	$("#idchk").on("propertychange change input paste",function(){
		$.ajax({
			async:true, // 비동기방식. default : true;
			type : 'post', // 포스트 방식으로 전송
			url  : "idcheck.mg", // controller로 간당~
			data : { "memid" : $("#idchk").val()}, // json방식으로 전송(key, value)
			dataType : "json",
			success : function(data){
				if(data>0){
					$('font[id=warning]').text('');
					$('font[id=warning]').attr('color','red');
					$('font[id=warning]').text('이미 존재하는 아이디입니다.');
					$("#memid").focus();
				} else {
					$('font[id=warning]').text('');
					$('font[id=warning]').attr('color','blue');
					$('font[id=warning]').text('사용 가능한 아이디입니다.');
					$("#memid").focus();
					idchk = 1; // idchk 1이 아니면 submit 못하게 하려고.
				}	
			},
			error : function(error){
				alert("error : ");
			}
		});
	});
});

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
  