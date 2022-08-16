package com.notgabs.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunes = new ArrayList<>();

	public FileFortuneService() {
		try (BufferedReader br = new BufferedReader(new FileReader("fortunes.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				fortunes.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Random random = new Random();

	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.size());

		String theFortune = fortunes.get(index);

		return theFortune;
	}

}
