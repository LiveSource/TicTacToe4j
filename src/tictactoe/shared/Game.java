package tictactoe.shared;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Game implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String PLAYER_O = "O";

	public static final String PLAYER_X = "X";

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;

	@Persistent
	private String playerONickName;

	@Persistent
	private String playerXNickName;

	@Persistent
	private String nextPlayer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayerONickName() {
		return playerONickName;
	}

	public void setPlayerONickName(String playerONickName) {
		this.playerONickName = playerONickName;
	}

	public String getPlayerXNickName() {
		return playerXNickName;
	}

	public void setPlayerXNickName(String playerXNickName) {
		this.playerXNickName = playerXNickName;
	}

	public String getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(String nextPlayer) {
		this.nextPlayer = nextPlayer;
	}

}
