package com.zendesk.maxwell.row;

// we wrap up raw json here and use the type of this class to allow
// tunneling pre-serialized JSON data through a RowMap

import java.io.Serializable;

public class RawJSONString implements Serializable {
	public final String json;

	public RawJSONString(String json) {
		this.json = json;
	}
}
