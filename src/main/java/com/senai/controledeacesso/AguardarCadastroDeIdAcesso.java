package com.senai.controledeacesso;

import java.util.concurrent.Future;

public class AguardarCadastroDeIdAcesso {
    public static void aguardarCadastroDeIdAcesso() {
        ControleDeAcesso.modoCadastrarIdAcesso = true;
        System.out.println("Aguardando nova tag ou cartão para associar ao usuário");
        // Usar Future para aguardar até que o cadastro de ID seja concluído

        Future<?> future =  ControleDeAcesso.executorCadastroIdAcesso.submit(() -> {
            while (ControleDeAcesso.modoCadastrarIdAcesso) {
                // Loop em execução enquanto o modoCadastrarIdAcesso estiver ativo
                try {
                    Thread.sleep(100); // Evita uso excessivo de CPU
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        try {
            future.get(); // Espera até que o cadastro termine
        } catch (Exception e) {
            System.err.println("Erro ao aguardar cadastro: " + e.getMessage());
        }
    }
}
