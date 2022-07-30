  function loginCheck(e){
		e.preventDefault();
		const id = document.getElementById('id');
		const password = document.getElementById('password');
		console.log(id);
		console.log(password);
		
		if (!id.value){
			id.focus();
			alert('아이디 입력해 주세요');
			return ;
		}
		
		if (!password.value){
			password.focus();
			alert('비밀번호를 입력해 주세요');
			return ;
		}
		document.getElementById('login-post').submit();
}
