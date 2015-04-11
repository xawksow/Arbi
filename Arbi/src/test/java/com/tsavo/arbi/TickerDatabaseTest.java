package com.tsavo.arbi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.tsavo.trade.db.LiveTicker;
import com.xeiam.xchange.Exchange;
import com.xeiam.xchange.exceptions.ExchangeException;
import com.xeiam.xchange.exceptions.NotAvailableFromExchangeException;
import com.xeiam.xchange.exceptions.NotYetImplementedForExchangeException;

public class TickerDatabaseTest {

	@Test
	public void test() throws ExchangeException, NotAvailableFromExchangeException, NotYetImplementedForExchangeException, IOException, InterruptedException {
		List<Exchange> exchanges = new ArrayList<>();

		List<LiveTicker> tickers = new ArrayList<>();
		exchanges.forEach(exchange -> tickers.add(new LiveTicker(exchange)));
		while (true) {
			Date when = new Date(new Date().getTime() - 1000000000);
			when.setHours(0);
			when.setMinutes(0);
			when.setSeconds(0);
			// tickers.forEach(ticker -> {
			// System.out.println(ticker.db.exchangeName + " "
			// + ticker.getDataForTimeframe(new CurrencyPair("BTC", "USD"),
			// when, new Date(new Date().getTime() + 1000000), 1000 * 60 * 5));
			// });

			Thread.sleep(1000);
		}

	}
}
