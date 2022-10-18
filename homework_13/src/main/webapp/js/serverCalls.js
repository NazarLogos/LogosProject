$("button.createMagazine")
		.click(
				function() {
					
					var name = $("form.createMagazine input.magazineName").val();
					var author = $("form.createMagazine input.magazineAuthor").val();
					var description = $("form.createMagazine input.magazineDescription").val();
					var price = $("form.createMagazine input.magazinePrice").val();
				
						var magazine = {
								name : name,
								author : author ,
								description : description,
								price : price
						};
//add validation
						$.post("magazine", magazine,
								function(data) {
									if (data == 'Success') {
//										$("form")[0].reset();
//										$("form")[1].reset();
//										showAlertAfterRegistration();
										alert('Success');
									}
								});
					
				});
$("button.buy-product").click(function() {
	var productId = jQuery(this).attr("product-id");
	
	
	$.post("bucket", {'productId':productId},
			function(data) {
				if (data == 'Success') {
					$('#buyProductModal').modal('hide');
					alert('Success');
				}
			});
});