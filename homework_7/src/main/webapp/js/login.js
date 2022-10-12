


function showAlertAfterRegistration() {
	$('div.alertic').show();
}

//$('.message a').click(function() {
//	loginRegisterSwitch();
//});

$("button.btn")
		.click(
				function() {
					/*var firstName = $("form.register-form input.firstName")
							.val();
					var lastName = $("form.register-form input.lastName").val();
					var email = $(".card-back.input.email").val();
					var password = $(".card-back.input.password").val();
					var cpassword = $(".card-back.input.cpass")
							.val();*/
					var firstName = $("form.form-group input.firstName")
					.val();
			var lastName = $("form.form-group input.lastName").val();
			var email = $("form.form-group input.email").val();
			var password = $("form.form-group input.password").val();
			

					/*if (firstName == '' || lastName == '' || email == ''
							|| password == '' || cpassword == '') {
						alert("Please fill all fields...!!!!!!");
					} else if ((password.length) < 8) {
						alert("Password should atleast 8 character in length...!!!!!!");
					} else if (!(password).match(cpassword)) {
						alert("Your passwords don't match. Try again?");
					} else {
						var userRegistration = {
							firstName : firstName,
							lastName : lastName,
							email : email,
							password : password
						};

						$.post("registration", userRegistration,
								function(data) {
									if (data == 'Success') {
										$("input.firstName")[0].reset();
										
//										loginRegisterSwitch();
//										showAlertAfterRegistration();
									}
								});
					}*/
					var userRegistration = {
							firstName : firstName,
							lastName : lastName,
							email : email,
							password : password
						};

						$.post("registration", userRegistration,
								function(data) {
									if (data == 'Success') {
										$("form")[0].reset();
										$("form")[1].reset();
										
//										loginRegisterSwitch();
										showAlertAfterRegistration();
									}
								});
				});
