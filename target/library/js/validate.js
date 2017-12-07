
$.validator.setDefaults({
	submitHandler: function() {
		form.submit();
	}
});
$(document).ready(function() {
	$('#form').validate({
		rules: {
			username: "required",
            usertelephone: {
				required: true,
			},
            useremail: {
				required: true,
				email: true,
			},
            userpassword: {
				required: true,
				minlength: 8,
			},
			confirmPassword: {
				required: true,
				minlength: 8,
				equalTo: "#password",
			}
		},
		messages: {
            username: "用户名不能为空",
            usertelephone: "联系电话不能为空",
            useremail: {
				required: "邮箱输入不能为空",
				email: "请输入一个正确的邮箱",
			},
            userpassword: {
				required: "密码输入不能为空",
				minlength: "密码长度不能小于8位",
			},
			confirmPassword: {
				required: "输入不能为空",
				minlength: "密码长度不能小于8位",
				equalTo: "两次密码输入不一致",
			}
		}
	});
});