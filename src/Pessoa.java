package src;
public class Pessoa {
    
  //Variáveis
  
  private String nome;
  private String dataNasc;
  private String idade;
  private String telefone;

  //Metodos Get (obter) e Set (definir)
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getIdade(){
    return idade;
  }
  public void setIdade(String idade){
    this.idade = idade;
  }
  public String getDataNasc(){
    return dataNasc;
  }
  public void setDataNasc(String dataNasc){
    this.dataNasc = dataNasc;
  }
  public String getTelefone(){
    return telefone;
  }
  public void setTelefone(String telefone){
    this.telefone = telefone;
  }  
}
    