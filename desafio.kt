enum class Nivel {INICIANTE, INTERMEDIARIO, AVANCADO}

class Usuario(var nome: String, var codigoAlu: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 35, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    
    val inscritos = mutableListOf<Usuario>(
     Usuario("Venilton", 1)
    )
    // Matricula aluno na formação
    fun matricular(vararg usuarios: Usuario) {
        for(usuario in usuarios)
        inscritos.add(usuario)
    }
    //Carrega dados dos conteudos da formação
    fun carregarConteudos(){
        for(conteudos in conteudos)
        println(conteudos)
    }
    //Carrega dados dos alunos inscritos
    fun carregarInscritos(){
        for(inscrito in inscritos)
        println("Aluno: ${inscrito.nome} | Identificação: ${inscrito.codigoAlu}")       
    }
    
    
}

fun main() {

  var aluno = Usuario("Matheus", 20)
  var aluna = Usuario("Marcia",34)
  var alunoTres = Usuario("Antonio",64)
                         
  val listConteudo: List<ConteudoEducacional> = listOf(
  	ConteudoEducacional("Git e Github", nivel = Nivel.INICIANTE),
	ConteudoEducacional("Introdução ao Kotlin",  nivel = Nivel.INTERMEDIARIO),
 	ConteudoEducacional("Introdução ao Android Studio",  nivel = Nivel.INTERMEDIARIO),
    ConteudoEducacional("Depurando aplicações mobile",  nivel = Nivel.AVANCADO)
  )
   
  val forma = Formacao("MOBILE ANDROID",listConteudo)
     println("Formação: ${forma.nome}")
     forma.carregarConteudos()
  	 println("Lista de Alunos!")
     forma.carregarInscritos()
     forma.matricular(aluno,aluna,alunoTres)
     println("Lista atualizada com novos alunos!")
     forma.carregarInscritos()
}