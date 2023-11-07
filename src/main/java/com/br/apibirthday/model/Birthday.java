package com.br.apibirthday.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "birthday")
public class Birthday implements Serializable {

    private static final long serialVersionUID = 1L;
}
