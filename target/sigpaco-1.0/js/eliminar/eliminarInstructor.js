


function eliminar(id) {
    
    Swal.fire({
        title: "Estas seguro de eliminar Instructor?",
        text: "",
        icon: "warning",
        showCancelButton: true,
        confirmButtonColor: "#3085d6",
        cancelButtonColor: "#d33",
        confirmButtonText: "Si, eliminar!"
    }).then((result) => {
        if (result.isConfirmed) {
            
            eliminarMaquina(id);
            Swal.fire({
                title: "Eliminado!",
                text: "Instructor eliminada con éxito.",
                icon: "success"
            });

            setTimeout(function () {
                parent.location.href = "instructores";
            }, 1800);

        }
    });
}
async function eliminarMaquina(id) {
  let url = "eliminar-instructor?id=" + id;   
  const response =  await fetch(url, {
        method: "GET"        
    });
   
}


