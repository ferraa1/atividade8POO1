package atividade8POO1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//TESTES
		Documento documento = new Documento("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		System.out.println(documento.toString() + "\n");
		
		TipoImpressora tipoImp = TipoImpressora.TINTA;
		Impressora impressora = new Impressora("IMPPOO1-20210221", tipoImp.getValor());
		System.out.println(impressora.toString() + "\n");
		System.out.println(impressora.imprimir(documento) + "\n");
		
		Escritorio escritorio = new Escritorio();
		System.out.println(escritorio.toString() + "\n");
		
		Vendas.setMetaVendas(5000);
		Telemarketing.setMetaLigacoes(100);
		
		if (escritorio.addImpressora(impressora)) {
			System.out.println("Impressora adicionada com sucesso!\n");
		} else {
			System.out.println("Erro ao adicionar impressora!\n");
		}
		if (escritorio.addFuncionarioVendas("Carlos", "222.222.222-00", 4000)) {
			System.out.println("Funcionário adicionado com sucesso!\n");
		} else {
			System.out.println("Erro ao adicionar funcionário!\n");
		}
		if (escritorio.addFuncionarioTelemarketing("Rafael", "333.333.333-00", 2000)) {
			System.out.println("Funcionário adicionado com sucesso!\n");
		} else {
			System.out.println("Erro ao adicionar funcionário!\n");
		}
		System.out.println(escritorio.toString() + "\n");
		
		//CSV
		Scanner ler = new Scanner(System.in);
		FileWriter arq = new FileWriter("arquivo.csv");
		PrintWriter gravarArq = new PrintWriter(arq);
		for (Funcionario f : escritorio.getLfuncionario()) {
			gravarArq.printf("%s;%s;%f;%d\n", f.getNome(), f.getCpf(), f.getSalario(), f.getTipo());
		}
		arq.close();
		try {
			FileReader arq1 = new FileReader("arquivo.csv");
			BufferedReader lerArq = new BufferedReader(arq1);
			String linha = lerArq.readLine();
			escritorio.getLfuncionario().clear();
			while (linha != null) {
				String[] leitura = linha.split(";");
				if (Integer.parseInt(leitura[3]) == 1) {
					escritorio.addFuncionarioVendas(leitura[0], leitura[1], Double.parseDouble(leitura[2]));
				} else {
					escritorio.addFuncionarioTelemarketing(leitura[0], leitura[1], Double.parseDouble(leitura[2]));
				}
				linha = lerArq.readLine();
			}
			arq1.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}
		for (Funcionario f : escritorio.getLfuncionario()) {
			System.out.println(f.toString());
		}
		ler.close();
		
	}

}
