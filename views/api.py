import os
from pathlib import Path

from flask import Blueprint
from flask_restful import Api

from ..leaderboard import LeaderboardManager
from .resources.add import add

api_bp = Blueprint('api', __name__)
api = Api(api_bp)
leaderboard = LeaderboardManager(Path('./server/static/leaderboard.json'))


@api_bp.route('/')
def route_api():
    return "", 403


# register resources
api.add_resource(add, '/add', resource_class_kwargs={'leaderboard': leaderboard})
