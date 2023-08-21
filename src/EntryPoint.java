package src;

public class EntryPoint {
    public static void main(String args[]) {
        Pessoa usuario = new Pessoa();

        usuario.setNome("Rafael Raizer");
        usuario.setDataNasc("19/01/176");
        usuario.setIdade("47 Anos");
        usuario.setTelefone("(47)99932-7137");

        System.out.println("\n- Nome do Usuário => " + usuario.getNome());
        System.out.println("- Data de Nascimento => " + usuario.getDataNasc());
        System.out.println("- Idade => " + usuario.getIdade());
        System.out.println("- Telefone-Contato => " + usuario.getTelefone() + "\n");

    }
}
