package org.uci.spacify.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uci.spacify.entity.RoomEntity;
import org.uci.spacify.services.RoomService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/all")
    public List<RoomEntity> getAll() {
        return this.roomService.getAll();
    }
}
