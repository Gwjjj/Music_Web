package cn.gwjjj.util;

import java.io.Serializable;

/**
 * Created by sapling on 2017-12-25.
 */
public class MGResult implements Serializable {

	// ��Ӧ��״̬
	private Integer status;

	// ��Ӧ����Ϣ
	private String msg;

	// ��Ӧ������
	private Object data;

	public MGResult() {
		this.status = 200;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
