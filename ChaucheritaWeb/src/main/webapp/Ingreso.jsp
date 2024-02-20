<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ingresos</title>
</head>
<body>
<header class="container encabezado">
        <div class="row">
            <div class="col-md-4 text-center">
                <i class="fa-regular fa-envelope" style="margin: 8px 10px 0 10px;"></i>
                ABMODEL
            </div>
            <div class="col-md-4 text-center">
                <a href="../index.html" style="text-decoration: none; color:#000"><i class="fa-solid fa-laptop-code"
                        style="margin: 8px 10px 0 10px;"></i>
                    Proyecto Primer Bimestre</a>
            </div>
            <div class="col-md-4 text-center">
                <a href="https://twitter.com" style="color: #000;"><i class="fa-brands fa-twitter"
                    style="margin: 8px 10px 0 10px;"></i></a>
                <a href="https://www.facebook.com/" style="color: #000;"><i class="fa-brands fa-facebook"
                    style="margin: 8px 10px 0 10px;"></i></a>
                <a href="https://www.instagram.com/" style="color: #000;"><i class="fa-brands fa-instagram"
                    style="margin: 8px 10px 0 10px;"></i></a>
                <a href="https://www.linkedin.com/" style="color: #000;"><i class="fa-brands fa-linkedin"
                    style="margin: 8px 10px 0 10px;"></i></a>
            </div>
        </div>
    </header>
    <main class="content" style="margin-bottom: 100px;">
        <div class="container d-flex align-items-center justify-content-center mt-5">
            <div class="d-inline-block text-center p-5 bg-white row borderadius">
                <h2 class="fw-bold">Ingresos</h2>
                <div class="mt-3 mb-0">
                    <div class="input-group input-group-lg mt-3 mb-0">
                        <span class="input-group-text fs-4" id="monto">Monto</span>
                        <input type="text" class="form-control fs-4" placeholder="Ingrese el monto" pattern="-?[0-9]+" title="Por favor ingrese un n�mero v�lido" required>
                    </div>

                    <div class="input-group input-group-lg mt-3 mb-0">
                        <span class="input-group-text fs-4" id="fecha">Fecha</span>
                        <input type="date" class="form-control fs-4" id="fecha" placeholder="Ingrese la fecha" required>
                    </div>
                    <div class="input-group input-group-lg mt-3 mb-0">
                        <span class="input-group-text fs-4" id="categoria">Categor�a</span>
                        <select class="form-select form-select-lg fs-4" required>
                            <option value="">Seleccione una categor�a</option>
                            <option value="dos">N�mina</option>
                            <option value="tres">Universidad</option>
                            <option value="cuatro">Comida</option>
                        </select>
                    </div>
                    <div class="input-group input-group-lg mt-3 mb-0">
                        <span class="input-group-text fs-4" id="Concepto">Concepto</span>
                        <textarea  id="Concepto" class="form-control fs-4" placeholder="Agregue una descripci�n"></textarea>
                    </div>
                </div>
                <div class="mt-3 mb-0 text-center ">
                    <a href="../Parte4-Rengi/4.html" class="btn btn-primary btn-sm boton mx-4">Guardar</a>
                    <a href="../Parte4-Rengi/4.html" class="btn btn-primary btn-sm boton mx-4">Cancelar</a>
                </div>
            </div>
        </div>    
    </main>

</body>
</html>