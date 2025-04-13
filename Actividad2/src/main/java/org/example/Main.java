package org.example;

import org.apache.commons.cli.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Iniciando aplicación Actividad2");

        // Ejemplo de uso de Commons CLI
        Options options = new Options();
        options.addOption("h", "help", false, "Muestra la ayuda");
        options.addOption("v", "version", false, "Muestra la versión");
        options.addOption(Option.builder("n")
                .longOpt("name")
                .hasArg()
                .desc("Saluda al nombre especificado")
                .build());

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("h")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("Actividad2", options);
                System.exit(0);
            }

            if (cmd.hasOption("v")) {
                System.out.println("Actividad2 v1.0-SNAPSHOT");
                System.exit(0);
            }

            if (cmd.hasOption("n")) {
                String name = cmd.getOptionValue("n");
                logger.info("Hola, {}!", name);
                System.out.println("Hola, " + name + "!");
            } else {
                logger.warn("No se proporcionó el parámetro --name");
                System.out.println("Por favor usa --name <nombre> para saludar");
            }

        } catch (ParseException e) {
            logger.error("Error al parsear argumentos: {}", e.getMessage());
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }

        logger.info("Aplicación finalizada");
    }
}