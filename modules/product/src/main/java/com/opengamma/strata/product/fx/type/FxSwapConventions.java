/*
 * Copyright (C) 2015 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.strata.product.fx.type;

import com.opengamma.strata.collect.named.ExtendedEnum;

/**
 * Market standard FX swap conventions.
 */
public final class FxSwapConventions {

  /**
   * The extended enum lookup from name to instance.
   */
  static final ExtendedEnum<FxSwapConvention> ENUM_LOOKUP = ExtendedEnum.of(FxSwapConvention.class);

  //-------------------------------------------------------------------------
  /**
   * The "EUR/USD" FX Swap convention.
   * <p>
   * EUR/USD convention with 2 days spot date.
   */
  public static final FxSwapConvention EUR_USD =
      FxSwapConvention.of(StandardFxSwapConventions.EUR_USD.getName());

  /**
   * The "GBP/EUR" FX Swap convention.
   * <p>
   * GBP/EUR convention with 2 days spot date.
   */
  public static final FxSwapConvention GBP_EUR =
      FxSwapConvention.of(StandardFxSwapConventions.GBP_EUR.getName());

  /**
   * The "GBP/USD" FX Swap convention.
   * <p>
   * GBP/USD convention with 2 days spot date.
   */
  public static final FxSwapConvention GBP_USD =
      FxSwapConvention.of(StandardFxSwapConventions.GBP_USD.getName());

  /**
   * The "USD/ZAR" FX Swap convention.
   * <p>
   * USD/ZAR convention with 2 days spot date.
   */
  public static final FxSwapConvention USD_ZAR =
      FxSwapConvention.of(StandardFxSwapConventions.USD_ZAR.getName());

  /**
   * The "USD/MXN" FX Swap convention.
   * <p>
   * USD/MXN convention with 2 days spot date.
   */
  public static final FxSwapConvention USD_MXN =
      FxSwapConvention.of(StandardFxSwapConventions.USD_MXN.getName());

  //-------------------------------------------------------------------------
  /**
   * Restricted constructor.
   */
  private FxSwapConventions() {
  }

}
