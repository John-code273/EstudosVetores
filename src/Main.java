void main() {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    System.out.println("quantas pessoas seram digitadas? ");
    int n = scanner.nextInt();
    scanner.nextLine();
    String[] nome = new String[n];
    int[] idade = new int[n];
    double[] altura = new double[n];
    int index = 1;
    for (int i = 0; i < n; i++) {
        System.out.println("Dados da "+ index+ "ª pessoa");
        index++;
        System.out.print("Nome: ");
        nome[i] = scanner.nextLine();
        System.out.print("Idade: ");
        idade[i] = scanner.nextInt();
        System.out.print("Altura: ");
        altura[i] = scanner.nextDouble();
        scanner.nextLine();
    }
    double soma = 0;
    for (int i = 0; i <n; i++) {
        soma += altura[i];
    }
    double avc = soma / n ;
    System.out.printf("Altura media: %.2f%n", avc);


    int menor = 0;

    for (int i = 0; i < n; i++) {
        if (idade[i] < 16) {
            menor++;
        }
    }
    double porcento = (menor * 100.0) / n;
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcento);
    for (int i = 0; i < n; i++) {
        if( idade[i]< 16 ){
            System.out.println(nome[i]);
        }
    }
}
