package one.digitalinnovation.basecamp;

/**
 *  Classe criada pra o exercício da Aula sobre Controle de Fluxo.
 */

public class Main {

    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    private static void ifFlecha() {

        // O professor mandou evitar esse tipo de prática e sinceramente eu achei um inferno apesar de funcionar kkkkk

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void ifSemFlecha() {

        // Esse aqui ficou bem mais bonitinho *_*

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }


    }

    private static void ifFerias() {

        // Simplão. Gostei!

        String mes = "Julho";
        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
            System.out.println("Férias");
        }
    }

    private static void ifMenor() {

        // Certeza que ele montou esse exercício no auge da pandemia kkkcrying

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        boolean  salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDepentes =  quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDepentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        boolean recebeAuxilio = ((salarioBaixo) && (muitosDepentes));
        if (recebeAuxilio) {
            System.out.println("Funcionário dece receber auxílio. ");
        } else {
            System.out.println("Funcionário não deve receber auxilio. ");
        }
    }

    private static void switchSemana() {

        // Esse aqui foi interessante de montar.

        String dia = "Terça";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println(1);
                System.out.println("Dia inválido");
                break;


        }


    }

    private static  void switchNumero() {

        // Outro qu achei bem simples.

        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
            case 5:
                System.out.println("Talvez");
            default:
                System.out.println("Valor infefinido.");
                break;
        }
    }

    private static void switchFerias() {

        // Bem de boa, apesar de que eu burro tava montando a expressão com : onde não devia.
        // Foi fácil de achar na hora que executei.

        String mes = "Dezembro";
                switch (mes) {
                    case "dezembro":
                    case "julho":
                    case "janeiro":
                        System.out.println("Férias");
                        break;
                    default:
                        System.out.println("Valor indefinido.");
                        break;
                }
    }

}
