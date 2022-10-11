
public class RedeSocial{
    public class Usuario{
        public int id;
        public String nome;
        public Usuario[] amigos;

     
        public Usuario(int id, String nome){
            this.id = id;
            this.nome = nome;
        }
    }

    Usuario usuario = new Usuario(0, "Alice");
    
    public void addAmigo(int id, String nome){

        Usuario novoUsuario = new Usuario(id, nome);
        Usuario novosAmigos[] = new Usuario[this.usuario.amigos.length + 1];

        if(this.usuario.amigos[this.usuario.amigos.length] == null){
            this.usuario.amigos[this.usuario.amigos.length] = novoUsuario;
        }else{
            for(int i = 0; i < this.usuario.amigos.length; i++){
                novosAmigos[i] = this.usuario.amigos[i];
            }
            novosAmigos[this.usuario.amigos.length + 1] = novoUsuario;

            this.usuario.amigos = novosAmigos;
        }
    }

    public Usuario[] getAmigos(Usuario usuario){
        return usuario.amigos;
    }

    public static void main(String[] args) {
        RedeSocial rd = new RedeSocial();
        rd.usuario = new Usuario(0, "Alice");

    }

}