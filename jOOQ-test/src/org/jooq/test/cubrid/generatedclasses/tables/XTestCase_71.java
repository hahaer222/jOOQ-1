/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = -453062710;

	/**
	 * The singleton instance of <code>DBA.x_test_case_71</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.XTestCase_71 X_TEST_CASE_71 = new org.jooq.test.cubrid.generatedclasses.tables.XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record.class;
	}

	/**
	 * The column <code>DBA.x_test_case_71.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_71);

	/**
	 * The column <code>DBA.x_test_case_71.test_case_64_69_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> TEST_CASE_64_69_ID = createField("test_case_64_69_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_71);

	/**
	 * No further instances allowed
	 */
	private XTestCase_71() {
		super("x_test_case_71", org.jooq.test.cubrid.generatedclasses.Dba.DBA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record> getMainKey() {
		return org.jooq.test.cubrid.generatedclasses.Keys.X_TEST_CASE_71__PK_X_TEST_CASE_71;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record>>asList(org.jooq.test.cubrid.generatedclasses.Keys.X_TEST_CASE_71__PK_X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record, ?>>asList(org.jooq.test.cubrid.generatedclasses.Keys.X_TEST_CASE_71__FK_X_TEST_CASE_71A);
	}
}
