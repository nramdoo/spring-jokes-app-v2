package guru.springframework.spring5jokesappsv2.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	
	private final ChuckNorrisQuotes chuckNorrisnotes;
	

	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisnotes) {
		this.chuckNorrisnotes = chuckNorrisnotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisnotes.getRandomQuote();
	}

}
