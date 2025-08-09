package ch02_bank_statements_analyzer.tobe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzer {
    private static final String RESOURCES = "src/main/resources/";
    private static final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        Path path = Paths.get(RESOURCES + fileName);
        List<String> lines = Files.readAllLines(path);

        List<BankTransaction> bankTransactions = bankStatementParser.parseLineFromCSV(lines);
        BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

        collectSummary(bankStatementProcessor);
    }

    private static void collectSummary(BankStatementProcessor bankStatementProcessor) {
        System.out.println("모든 거래 내역의 합: " + bankStatementProcessor.calculateTotalAmount());
        System.out.println("1월 총 입출금 내역: " + bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));
        System.out.println("2월 총 입출금 내역: " + bankStatementProcessor.calculateTotalInMonth(Month.FEBRUARY));
        System.out.println("총 급여: " + bankStatementProcessor.calculateTotalForCategory("Salary"));
    }
}