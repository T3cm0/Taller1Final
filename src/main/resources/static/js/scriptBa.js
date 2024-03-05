function validarFormulario() {
    var nombres = document.getElementById('nombres').value.trim();
    var apellidos = document.getElementById('apellidos').value.trim();
    var correo = document.getElementById('correo').value.trim();
    var semestre = document.getElementById('semestre').value.trim();
    var descripcion = document.getElementById('descripcion').value.trim();
    var errorMessage = document.getElementById('error-message');

    errorMessage.innerHTML = '';

    if (!nombres || !apellidos || !correo || !semestre || !descripcion) {
        errorMessage.style.display = 'block';
        errorMessage.innerHTML += 'Todos los campos son obligatorios.<br>';
        return false;
    }

    if (nombres.length > 100 || apellidos.length > 100) {
        errorMessage.style.display = 'block';
        errorMessage.innerHTML += 'Los nombres y apellidos no pueden exceder los 100 caracteres.<br>';
        return false;
    }

    if (!correo.includes('@') || correo.split('@').length !== 2 || correo.split('@')[1].split('.').length < 2) {
        errorMessage.style.display = 'block';
        errorMessage.innerHTML += 'El correo no es válido.<br>';
        return false;
    }

    if (isNaN(semestre) || semestre < 0 || semestre > 16) {
        errorMessage.style.display = 'block';
        errorMessage.innerHTML += 'El semestre debe ser un número entre 0 y 16.<br>';
        return false;
    }

    return true;
}
