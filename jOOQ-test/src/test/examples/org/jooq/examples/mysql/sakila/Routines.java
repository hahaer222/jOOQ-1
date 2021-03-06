/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in sakila
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

	/**
	 * Call <code>sakila.film_in_stock</code>
	 */
	public static java.lang.Integer filmInStock(org.jooq.Configuration configuration, java.lang.Integer pFilmId, java.lang.Integer pStoreId) {
		org.jooq.examples.mysql.sakila.routines.SakilaFilmInStock p = new org.jooq.examples.mysql.sakila.routines.SakilaFilmInStock();
		p.setPFilmId(pFilmId);
		p.setPStoreId(pStoreId);

		p.execute(configuration);
		return p.getPFilmCount();
	}

	/**
	 * Call <code>sakila.film_not_in_stock</code>
	 */
	public static java.lang.Integer filmNotInStock(org.jooq.Configuration configuration, java.lang.Integer pFilmId, java.lang.Integer pStoreId) {
		org.jooq.examples.mysql.sakila.routines.SakilaFilmNotInStock p = new org.jooq.examples.mysql.sakila.routines.SakilaFilmNotInStock();
		p.setPFilmId(pFilmId);
		p.setPStoreId(pStoreId);

		p.execute(configuration);
		return p.getPFilmCount();
	}

	/**
	 * Call <code>sakila.get_customer_balance</code>
	 */
	public static java.math.BigDecimal getCustomerBalance(org.jooq.Configuration configuration, java.lang.Integer pCustomerId, java.sql.Timestamp pEffectiveDate) {
		org.jooq.examples.mysql.sakila.routines.SakilaGetCustomerBalance f = new org.jooq.examples.mysql.sakila.routines.SakilaGetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>sakila.get_customer_balance</code> as a field
	 */
	public static org.jooq.Field<java.math.BigDecimal> getCustomerBalance(java.lang.Integer pCustomerId, java.sql.Timestamp pEffectiveDate) {
		org.jooq.examples.mysql.sakila.routines.SakilaGetCustomerBalance f = new org.jooq.examples.mysql.sakila.routines.SakilaGetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		return f.asField();
	}

	/**
	 * Get <code>sakila.get_customer_balance</code> as a field
	 */
	public static org.jooq.Field<java.math.BigDecimal> getCustomerBalance(org.jooq.Field<java.lang.Integer> pCustomerId, org.jooq.Field<java.sql.Timestamp> pEffectiveDate) {
		org.jooq.examples.mysql.sakila.routines.SakilaGetCustomerBalance f = new org.jooq.examples.mysql.sakila.routines.SakilaGetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		return f.asField();
	}

	/**
	 * Call <code>sakila.inventory_held_by_customer</code>
	 */
	public static java.lang.Integer inventoryHeldByCustomer(org.jooq.Configuration configuration, java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.SakilaInventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.routines.SakilaInventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>sakila.inventory_held_by_customer</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> inventoryHeldByCustomer(java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.SakilaInventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.routines.SakilaInventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Get <code>sakila.inventory_held_by_customer</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> inventoryHeldByCustomer(org.jooq.Field<java.lang.Integer> pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.SakilaInventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.routines.SakilaInventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Call <code>sakila.inventory_in_stock</code>
	 */
	public static java.lang.Byte inventoryInStock(org.jooq.Configuration configuration, java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.SakilaInventoryInStock f = new org.jooq.examples.mysql.sakila.routines.SakilaInventoryInStock();
		f.setPInventoryId(pInventoryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>sakila.inventory_in_stock</code> as a field
	 */
	public static org.jooq.Field<java.lang.Byte> inventoryInStock(java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.SakilaInventoryInStock f = new org.jooq.examples.mysql.sakila.routines.SakilaInventoryInStock();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Get <code>sakila.inventory_in_stock</code> as a field
	 */
	public static org.jooq.Field<java.lang.Byte> inventoryInStock(org.jooq.Field<java.lang.Integer> pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.SakilaInventoryInStock f = new org.jooq.examples.mysql.sakila.routines.SakilaInventoryInStock();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Call <code>sakila.rewards_report</code>
	 */
	public static java.lang.Integer rewardsReport(org.jooq.Configuration configuration, java.lang.Byte minMonthlyPurchases, java.math.BigDecimal minDollarAmountPurchased) {
		org.jooq.examples.mysql.sakila.routines.SakilaRewardsReport p = new org.jooq.examples.mysql.sakila.routines.SakilaRewardsReport();
		p.setMinMonthlyPurchases(minMonthlyPurchases);
		p.setMinDollarAmountPurchased(minDollarAmountPurchased);

		p.execute(configuration);
		return p.getCountRewardees();
	}
}
