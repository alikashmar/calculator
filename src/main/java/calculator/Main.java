package calculator;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import calculator.eval.Evaluator;

public class Main {
	
	static final Logger log = LogManager.getLogger("calculator");

	public static void main(String[] args) {
		
		Options options = new Options();

        Option logLevel = new Option("l", "logLevel", true, "log level");
        logLevel.setRequired(false);
        options.addOption(logLevel);
        
        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
        	log.error("could not parse command line arguments", e);
            formatter.printHelp("java calculator.Main [OPTIONS] <Expression>", options);
            System.exit(1);
            return;
        }
        
        if(cmd.getArgList().isEmpty()) {
        	formatter.printHelp("java calculator.Main [OPTIONS] <Expression>", options);
            System.exit(1);
            return;
        }
		
        String level = cmd.getOptionValue('l');
		if(level != null) {
			switch(level.toLowerCase()) {
			case "error":
				Configurator.setRootLevel(Level.ERROR);
				break;
			case "warn":
				Configurator.setRootLevel(Level.WARN);
				break;
			case "info":
				Configurator.setRootLevel(Level.INFO);
				break;
			case "debug":
				Configurator.setRootLevel(Level.DEBUG);
				break;
			case "trace":
				Configurator.setRootLevel(Level.TRACE);
				break;
			}
		}
		
		log.info("Evaluating expression:  " + cmd.getArgList().get(0));
		
		Evaluator eval = new Evaluator();
		try {
			log.info("result is: " + eval.evaluate(cmd.getArgList().get(0)));
		} catch (ParseCancellationException ex) {
			log.error("could not evaluate expression", ex);
		}
	}

}
