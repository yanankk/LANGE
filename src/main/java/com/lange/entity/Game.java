package com.lange.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
/**
 *
 * @Author linhao Hu
 * @Date
 *
 */
@Data
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playerOne;
    private String playerTwo;
    private Long projectId;
    private int type;       //0：赛前 1：赛中 2：赛后'
    private Date createTime;
    private Date endTime;
}
