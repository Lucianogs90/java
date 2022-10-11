
public class RedeSocial{
    public static class Usuario{
        public int id;
        public String nome;
        public Usuario[] amigos = new Usuario[10];

     
        public Usuario(int id, String nome){
            this.id = id;
            this.nome = nome;
        }
    }

    public Usuario user;

    public Usuario getUsuarioById(int id){
        if(this.user.id == id){
            return user;
        } else{
            return null;
        }
    }

    public Usuario addUsuario(int id, String nome){
        this.user = new Usuario(id, nome);
        return user;
    }
    
    public void addAmigo(int idUsuario, int idAmigo, String nome){

        Usuario novoUsuario = new Usuario(idAmigo, nome);
        Usuario novosAmigos[] = new Usuario[this.getUsuarioById(idUsuario).amigos.length + 1];

        int i = 0;
        while(this.getUsuarioById(idUsuario).amigos[i] == null){
            
        }
    }

    public Usuario[] getAmigos(Usuario usuario){
        return usuario.amigos;
    }

    public static void main(String[] args) {
        RedeSocial rd = new RedeSocial();
        rd.user = new Usuario(0, "Alice");

        rd.addAmigo(0, 1, "Bob");
        rd.addAmigo(0, 2, "Dan");
        rd.addAmigo(1, 3, "Eve");
        rd.addAmigo(1, 3, "Charlie");

        System.out.println(rd.user);
    }

}