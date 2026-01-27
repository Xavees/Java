 for (let i = 1; i <= 10; i++) {

            // CONTINUE
            if (i == 5) {
                continue; // pula o restante do laço e vai para o próximo i
            }

            // BREAK
            if (i == 8) {
                break; // encerra o laço imediatamente
            }

            console.log("Valor de i: " + i);
        }

        console.log("Laço finalizado");
   