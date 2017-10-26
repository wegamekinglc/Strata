/*
 * Copyright (C) 2015 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.strata.product.fx.type;

import static com.opengamma.strata.basics.currency.Currency.CAD;
import static com.opengamma.strata.basics.currency.Currency.EUR;
import static com.opengamma.strata.basics.currency.Currency.GBP;
import static com.opengamma.strata.basics.currency.Currency.MXN;
import static com.opengamma.strata.basics.currency.Currency.RUB;
import static com.opengamma.strata.basics.currency.Currency.TRY;
import static com.opengamma.strata.basics.currency.Currency.USD;
import static com.opengamma.strata.basics.currency.Currency.ZAR;
import static com.opengamma.strata.basics.date.HolidayCalendarIds.CATO;
import static com.opengamma.strata.basics.date.HolidayCalendarIds.EUTA;
import static com.opengamma.strata.basics.date.HolidayCalendarIds.GBLO;
import static com.opengamma.strata.basics.date.HolidayCalendarIds.MXMC;
import static com.opengamma.strata.basics.date.HolidayCalendarIds.SAT_SUN;
import static com.opengamma.strata.basics.date.HolidayCalendarIds.USNY;
import static com.opengamma.strata.basics.date.HolidayCalendarIds.ZAJO;

import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.BusinessDayConventions;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.date.HolidayCalendarId;

/**
 * Market standard FX swap conventions.
 */
public final class StandardFxSwapConventions {

  // Join calendar with the main currencies
  private static final HolidayCalendarId EUTA_USNY = EUTA.combinedWith(USNY);
  private static final HolidayCalendarId GBLO_EUTA = GBLO.combinedWith(EUTA);
  private static final HolidayCalendarId GBLO_USNY = GBLO.combinedWith(USNY);
  private static final HolidayCalendarId ZAJO_USNY = ZAJO.combinedWith(USNY);
  private static final HolidayCalendarId MXMC_USNY = MXMC.combinedWith(USNY);
  private static final HolidayCalendarId CATO_USNY = CATO.combinedWith(USNY);

  /**
   * EUR/USD convention with 2 days spot date.
   */
  public static final FxSwapConvention EUR_USD =
      ImmutableFxSwapConvention.of(
          CurrencyPair.of(EUR, USD),
          DaysAdjustment.ofBusinessDays(2, EUTA_USNY),
          BusinessDayAdjustment.of(BusinessDayConventions.MODIFIED_FOLLOWING, EUTA_USNY));

  /**
   * GBP/EUR convention with 2 days spot date.
   */
  public static final FxSwapConvention GBP_EUR =
      ImmutableFxSwapConvention.of(
          CurrencyPair.of(GBP, EUR),
          DaysAdjustment.ofBusinessDays(2, GBLO_EUTA),
          BusinessDayAdjustment.of(BusinessDayConventions.MODIFIED_FOLLOWING, GBLO_EUTA));

  /**
   * GBP/USD convention with 2 days spot date.
   */
  public static final FxSwapConvention GBP_USD =
      ImmutableFxSwapConvention.of(
          CurrencyPair.of(GBP, USD),
          DaysAdjustment.ofBusinessDays(2, GBLO_USNY),
          BusinessDayAdjustment.of(BusinessDayConventions.MODIFIED_FOLLOWING, GBLO_USNY));

  /**
   * USD/ZAR convention with 2 days spot date.
   */
  public static final FxSwapConvention USD_ZAR =
      ImmutableFxSwapConvention.of(
          CurrencyPair.of(USD, ZAR),
          DaysAdjustment.ofBusinessDays(2, ZAJO_USNY),
          BusinessDayAdjustment.of(BusinessDayConventions.MODIFIED_FOLLOWING, ZAJO_USNY));

  /**
   * USD/MXN convention with 2 days spot date.
   */
  public static final FxSwapConvention USD_MXN =
      ImmutableFxSwapConvention.of(
          CurrencyPair.of(USD, MXN),
          DaysAdjustment.ofBusinessDays(2, MXMC_USNY),
          BusinessDayAdjustment.of(BusinessDayConventions.MODIFIED_FOLLOWING, MXMC_USNY));

  public static final FxSwapConvention USD_CAD =
      ImmutableFxSwapConvention.of(CurrencyPair.of(USD, CAD),
          DaysAdjustment.ofBusinessDays(1, CATO_USNY),
          BusinessDayAdjustment.of(BusinessDayConventions.MODIFIED_FOLLOWING, CATO_USNY));

  public static final FxSwapConvention USD_TRY =
      ImmutableFxSwapConvention.of(CurrencyPair.of(USD, TRY),
          DaysAdjustment.ofBusinessDays(1, SAT_SUN),
          BusinessDayAdjustment.of(BusinessDayConventions.MODIFIED_FOLLOWING, SAT_SUN));

  public static final FxSwapConvention USD_RUB =
      ImmutableFxSwapConvention.of(CurrencyPair.of(USD, RUB),
          DaysAdjustment.ofBusinessDays(1, SAT_SUN),
          BusinessDayAdjustment.of(BusinessDayConventions.MODIFIED_FOLLOWING, SAT_SUN));

  // TODO EUR/GBP, AUD/CHF, USD/RUB, USD/TWD, AUD/CAD, USD/JPY, USD/ARS, GBP/JPY, EUR/JPY, GBP/USD, EUR/USD, USD/SGD, USD/THB, CHF/TRY, 
//  EUR/PLN, USD/SEK, USD/INR, USD/IDR, USD/CNY, USD/ILS, USD/KRW, EUR/ILS, CHF/ZAR, USD/MYR, EUR/SEK, USD/PLN, GBP/SEK, AUD/NZD, 
//  NZD/CHF, USD/MXN, EUR/CHF, EUR/NOK, EUR/AUD, GBP/AUD, USD/NOK, AUD/USD, USD/CHF, USD/CAD, AUD/JPY, EUR/HUF, USD/CZK, USD/ZAR, 
//  USD/CNH, EUR/TRY, NZD/USD, USD/TRY, EUR/NZD, USD/HKD, NOK/SEK, TRY/JPY, EUR/ZAR, USD/HUF, USD/BRL, GBP/ZAR, EUR/CZK

  //-------------------------------------------------------------------------
  /**
   * Restricted constructor.
   */
  private StandardFxSwapConventions() {
  }

}
