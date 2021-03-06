package net.porillo.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contribution {

	/**
	 * Random UUID created for this contribution
	 */
	private Integer uniqueID;
	/**
	 * UUID of the Player who caused this contribution
	 */
	private Integer contributer;
	/**
	 * UUID of the associated object that corresponds to this emission
	 */
	private Integer contributionKey;
	/**
	 * Name of the Bukkit world this contribution took place
	 */
	private String worldName;
	/**
	 * Calculated emissions value for this contribution
	 */
	private Integer contributionValue;

	public Contribution(ResultSet rs) throws SQLException {
		this.uniqueID = rs.getInt(1);
		this.contributer = rs.getInt(2);
		this.contributionKey = rs.getInt(3);
		this.worldName = rs.getString(4);
		this.contributionValue = rs.getInt(5);
	}
}
