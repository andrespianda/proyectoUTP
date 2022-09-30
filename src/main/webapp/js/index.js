$(document).ready(function () {

    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
    });


});

function autenticarUsuario() {

    let username = $("#usuario").val();
    let contrasena = $("#contrasena").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            username: username,
            contrasena: contrasena
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#login-error").addClass("d-none");
                let username = parsedResult['username'];
                document.location.href = "home.html?username=" + username;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
function registrarUsuario() {

    let username = $("#input-username").val();
    let contrasena = $("#input-contrasena").val();
    let contrasenaConfirmacion = $("#input-contrasena-repeat").val();
    let nombreUsuario = $("#input-nombre").val();
    let apellidoUsuario = $("#input-apellidos").val();
    let identificacionUsuario = $("#input-identificacionUsuario").val();
    let nombreMascota = $("#input-nombreMascota").val();
    let razaMascota = $("#input-razaMascota").val();
    let tipoMascota = $("#input-tipoMascota").val();
    let celular = $("#input-celular").val();
    let direccion = $("#input-direccion").val();
    let correo = $("#input-email").val();





        if (contrasena === contrasenaConfirmacion) {






            $.ajax({
                type: "GET",
                dataType: "html",
                url: "./ServletUsuarioRegister",
                data: $.param({
                    username: username,
                    contrasena: contrasena,
                    nombreUsuario: nombreUsuario,
                    apellidoUsuario: apellidoUsuario,
                    identificacionUsuario: identificacionUsuario,
                    correo: correo,
                    nombreMascota: nombreMascota,
                    razaMascota: razaMascota,
                    tipoMascota: tipoMascota,
                    celular: celular,
                    direccion: direccion
                }),
                success: function (result) {
                    let parsedResult = JSON.parse(result);
                    if (parsedResult != false) {
                        $("#register-error").addClass("d-none");
                        let username = parsedResult['username'];
                        document.location.href = "home.html?username=" + username;
                    } else {
                        $("#register-error").removeClass("d-none");
                        $("#register-error").html("Error en el registro del usuario");
                    }
                }
            });
        } else {
            $("#register-error").removeClass("d-none");
            $("#register-error").html("Las contraseñas no coinciden");
        }
    
}
